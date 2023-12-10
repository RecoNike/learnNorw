package com.recon.norwegianlearn

import LanguageData
import LanguageDataManager
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var textToSpeech: TextToSpeech
    private lateinit var NorwTextView: TextView
    private lateinit var TransTextView: TextView
    private lateinit var NorwPhrView: TextView
    private lateinit var PhrTransView: TextView
    private lateinit var NextButton: TextView
    private lateinit var SpeakerText: ImageButton
    private lateinit var SpeakerSentence: ImageButton
    lateinit var TranscribtionText : TextView
    private val languageDataManager = LanguageDataManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NorwTextView = findViewById(R.id.NorwTextV)
        TranscribtionText = findViewById(R.id.TranscV)
        TransTextView = findViewById(R.id.TransTextV)
        NorwPhrView = findViewById(R.id.NorwPhraV)
        PhrTransView = findViewById(R.id.TransPhraV)
        NextButton = findViewById(R.id.NextV)
        SpeakerText = findViewById(R.id.SpeakTx)
        SpeakerSentence = findViewById(R.id.SpeakSent)

        // Initialize TextToSpeech
        textToSpeech = TextToSpeech(this, this)
        val speechRate = 0.4f
        textToSpeech.setSpeechRate(speechRate)
        val randomLanguageData = languageDataManager.getRandomLanguageData()
        updateViews(randomLanguageData)

        NextButton.setOnClickListener {
            val nextRandomLanguageData = languageDataManager.getRandomLanguageData()
            updateViews(nextRandomLanguageData)
        }

        SpeakerText.setOnClickListener {
            val textToRead = NorwTextView.text.toString()
            speakOut(textToRead)
        }

        SpeakerSentence.setOnClickListener {
            val sentenceToRead = NorwPhrView.text.toString()
            speakOut(sentenceToRead)
        }
    }

    private fun updateViews(languageData: LanguageData) {
        NorwTextView.text = languageData.norwegianText
        TransTextView.text = languageData.translatedText
        NorwPhrView.text = languageData.norwegianSentence
        PhrTransView.text = languageData.translatedSentence
        TranscribtionText.text = languageData.transcription
    }

    private fun speakOut(text: String) {
        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = textToSpeech.setLanguage(Locale("no"))
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                // Handle errors if language is missing or not supported
                // You can add your error handling code here
            }
        } else {
            // Handle errors during TextToSpeech initialization
            // You can add your error handling code here
        }
    }

    override fun onDestroy() {
        // Release resources when the activity is destroyed
        if (textToSpeech.isSpeaking) {
            textToSpeech.stop()
        }
        textToSpeech.shutdown()
        super.onDestroy()
    }
}
