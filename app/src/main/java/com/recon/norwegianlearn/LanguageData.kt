data class LanguageData(
    val norwegianText: String,
    val transcription: String,
    val translatedText: String,
    val norwegianSentence: String,
    val translatedSentence: String
)
class LanguageDataManager {
    private val languageDataList = listOf(
        LanguageData(
            "Hei",
            "хэй",
            "Привет",
            "Hei, hvordan har du det?",
            "Привет, как у тебя дела?"
        ),
        LanguageData("Takk", "такк", "Спасибо", "Takk for hjelpen.", "Спасибо за помощь."),
        LanguageData(
            "Ja",
            "я",
            "Да",
            "Ja, jeg vil gjerne ha en kopp kaffe.",
            "Да, я бы хотел чашку кофе."
        ),
        LanguageData(
            "Nei",
            "нэй",
            "Нет",
            "Nei, jeg kan ikke komme i dag.",
            "Нет, сегодня я не могу прийти."
        ),
        LanguageData("Venn", "венн", "Друг", "Han er min beste venn.", "Он мой лучший друг."),
        LanguageData(
            "Familie",
            "фамíлие",
            "Семья",
            "Vi tilbringer tid sammen som en familie.",
            "Мы проводим время вместе как семья."
        ),
        LanguageData(
            "Huset",
            "хусэт",
            "Дом",
            "Jeg elsker mitt lille hus.",
            "Я люблю свой маленький дом."
        ),
        LanguageData(
            "Mat",
            "мат",
            "Еда",
            "Vi skal lage mat sammen i kveld.",
            "Сегодня вечером мы будем готовить еду вместе."
        ),
        LanguageData(
            "Skole",
            "сколэ",
            "Школа",
            "Barna går på skole hver dag.",
            "Дети ходят в школу каждый день."
        ),
        LanguageData(
            "Arbeid",
            "арбайд",
            "Работа",
            "Jeg liker jobben min.",
            "Мне нравится моя работа."
        ),
        LanguageData("Tid", "тид", "Время", "Har du tid i morgen?", "У тебя есть время завтра?"),
        LanguageData(
            "Penger",
            "пенгэр",
            "Деньги",
            "Jeg må spare penger til ferien.",
            "Мне нужно сэкономить деньги на отпуск."
        ),
        LanguageData(
            "Kjærlighet",
            "шельювелюве",
            "Любовь",
            "Kjærlighet er viktig i livet.",
            "Любовь важна в жизни."
        ),
        LanguageData(
            "Være",
            "вэрэ",
            "Быть",
            "Jeg vil være en lege når jeg blir stor.",
            "Когда я вырасту, я хочу быть врачом."
        ),
        LanguageData(
            "Hjelp",
            "иэльп",
            "Помощь",
            "Kan du gi meg litt hjelp?",
            "Можешь помочь мне немного?"
        ),
        LanguageData(
            "By",
            "бю",
            "Город",
            "Oslo er hovedstaden i Norge.",
            "Осло - столица Норвегии."
        ),
        LanguageData(
            "Land",
            "ланн",
            "Страна",
            "Norge er et vakkert land.",
            "Норвегия - красивая страна."
        ),
        LanguageData(
            "Vann",
            "ванн",
            "Вода",
            "Jeg drikker alltid vann til lunsj.",
            "Я всегда пью воду на обед."
        ),
        LanguageData(
            "Mat",
            "мат",
            "Еда",
            "Spiser du alltid sunn mat?",
            "Ты всегда ешь здоровую пищу?"
        ),
        LanguageData(
            "Sove",
            "сувэ",
            "Спать",
            "Jeg elsker å sove lenge i helgene.",
            "Мне нравится долго спать по выходным."
        ),
        LanguageData(
            "Musikk",
            "мусик",
            "Музыка",
            "Musikk gjør dagen bedre.",
            "Музыка делает день лучше."
        ),
        LanguageData(
            "Reise",
            "райзе",
            "Путешествовать",
            "Jeg vil reise verden rundt.",
            "Я хочу путешествовать по всему миру.",
        ),    LanguageData("Reise", "райзе", "Путешествовать", "Jeg vil reise verden rundt.", "Я хочу путешествовать по всему миру."),
        LanguageData("Bok", "бук", "Книга", "Jeg elsker å lese en god bok.", "Мне нравится читать хорошую книгу."),
        LanguageData("Film", "филм", "Фильм", "Vi skal se på en film i kveld.", "Сегодня вечером мы собираемся посмотреть фильм."),
        LanguageData("Mus", "мус", "Мышь", "Det er en mus i kjøkkenet.", "В кухне есть мышь."),
        LanguageData("Fisk", "фиск", "Рыба", "Vi spiser ofte fersk fisk.", "Мы часто едим свежую рыбу."),
        LanguageData("Frukt", "фрукт", "Фрукты", "Jeg liker å spise frukt til frokost.", "Мне нравится есть фрукты на завтрак."),
        LanguageData("Kaffe", "кафе", "Кофе", "Jeg drikker alltid kaffe om morgenen.", "Я всегда пью кофе утром."),
        LanguageData("Te", "тэ", "Чай", "Vil du ha en kopp te?", "Хочешь чашку чая?"),
        LanguageData("Skrive", "скривэ", "Писать", "Jeg liker å skrive i dagboken min.", "Мне нравится писать в своем дневнике."),
        LanguageData("Lese", "лесе", "Читать", "Hun leser en bok på norsk.", "Она читает книгу на норвежском."),
        LanguageData("Språk", "спро", "Язык", "Jeg lærer et nytt språk.", "Я учу новый язык."),
        LanguageData("Sol", "соль", "Солнце", "Det er sol ute i dag.", "Сегодня солнечно."),
        LanguageData("Regn", "рэйн", "Дождь", "Vi trenger en paraply, det regner ute.", "Нам нужен зонт, идет дождь."),
        LanguageData("Snø", "сню", "Снег", "Barna elsker å leke i snøen.", "Дети любят играть в снегу."),
        LanguageData("Høst", "хёст", "Осень", "Bladene faller av trærne om høsten.", "Листья падают с деревьев осенью."),
        LanguageData("Vår", "вор", "Весна", "Temperaturen stiger om våren.", "Температура поднимается весной."),
        LanguageData("Sommer", "суммер", "Лето", "Jeg elsker å tilbringe sommeren ved sjøen.", "Мне нравится проводить лето у моря."),
        LanguageData("Farge", "фаргэ", "Цвет", "Hva er din favorittfarge?", "Какой у тебя любимый цвет?"),
        LanguageData("Sport", "спорт", "Спорт", "Han liker å spille sport.", "Ему нравится заниматься спортом."),
        LanguageData("Helse", "хэльсе", "Здоровье", "God helse er viktig.", "Здоровье важно."),
        LanguageData("Jobb", "юб", "Работа", "Jeg har en travel jobb.", "У меня напряженная работа."),
        LanguageData("Hobby", "хобби", "Хобби", "Hva er din favoritthobby?", "Какое у тебя любимое хобби?"),
        LanguageData("Reise", "райзе", "Путешествовать", "Jeg drømmer om å reise til Japan.", "Мечтаю поехать в Японию."),
        LanguageData("Natt", "натт", "Ночь", "Det er stjerneklart på himmelen om natten.", "Ночью ясное звездное небо.")

    )
    fun getRandomLanguageData(): LanguageData {
        val randomIndex = (0 until languageDataList.size).random()
        return languageDataList[randomIndex]
    }
}
