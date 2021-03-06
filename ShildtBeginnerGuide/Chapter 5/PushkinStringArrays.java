// Демонстрация использования массивов строк
class PushkinStringArrays {
	public static void main(String args[]) {
		String strs[] = {
			"\t" + "Александр Сергеевич Пушкин",
			"\t" + "Красавице, которая нюхала табак",
			"Возможно ль? вместо роз, Амуром насажденных,",
			"Тюльпанов, гордо наклоненных,",
			"Душистых ландышей, ясминов и лилей,",
			"Которых ты всегда любила",
			"И прежде всякий день носила",
			"На мраморной груди твоей, —",
			"Возможно ль, милая Климена,",
			"Какая странная во вкусе перемена!",
			"Ты любишь обонять не утренний цветок,",
			"А вредную траву зелену,",
			"Искусством превращенну",
			"В пушистый порошок!",
			"Пускай уже седой профессор Геттингена,",
			"На старой кафедре согнувшися дугой,",
			"Вперив в латинщину глубокий разум свой,",
			"Раскашлявшись, табак толченый",
			"Пихает в длинный нос иссохшею рукой;",
			"Пускай младой драгун усатый",
			"Поутру, сидя у окна,",
			"С остатком утреннего сна,",
			"Из трубки пенковой дым гонит сероватый;",
			"Пускай красавица шестидесяти лет,",
			"У граций в отпуску и у любви в отставке,",
			"Которой держится вся прелесть на подставке,",
			"Которой без морщин на теле места нет,",
			"Злословит, молится, зевает",
			"И с верным табаком печали забывает, —",
			"А ты, прелестная!.. но если уж табак",
			"Так нравится тебе — о пыл воображенья! —",
			"Ах! если, превращенный в прах,",
			"И в табакерке, в заточенье,",
			"Я в персты нежные твои попасться мог,",
			"Тогда б я в сладком восхищенье",
			"Рассыпался на грудь под шелковый платок",
			"И даже... может быть... Но что! мечта пустая.",
			"Не будет этого никак.",
			"Судьба завистливая, злая!",
			"Ах, отчего я не табак!",
		};

		System.out.println("Исходный массив: ");
		for(String s: strs)
			System.out.println("\t" + s);
		System.out.println("\n");

		// Изменить строку
		strs[2] = "также является";
		strs[3] = "текстом";

		System.out.println("Исходный массив: ");
		for(String s: strs)
			System.out.println(s + " ");
		System.out.println();
	}
}