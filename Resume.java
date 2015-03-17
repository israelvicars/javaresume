class Resume {
	
	void contact () {
		String fullName = "Israel Samson Vicars";
		double lattitude = 42.3775564;
		double longitude = -82.9401358;
		long mobilePhone = +1_734_646_0035L;
		String email = "me@israelvicars.com";
		
		System.out.println(fullName + "\n");
		System.out.printf("Location: %f, %f\n", lattitude, longitude);
		System.out.printf("Email: %s\nMobile: %d\n", email, mobilePhone);
	}

	void programming () {
		String programmingTraining = "Grand Circus Java Bootcamp 2015";
		String[] programmingLanguages = {"Java SE/EE", "JavaScript", "HTML/CSS"};
		String[] programmingTools = {"Eclipse", "JDK", "Android Studio"};
		String publicRepositories = "github.com/israelvicars"; 
		
		System.out.println("\nProgramming: \n");
		System.out.printf(" Trained at %s\n", programmingTraining);
		System.out.printf(" Familiar with these languages: \n");
		for (String language: programmingLanguages) 
			System.out.println("  " + language);
		System.out.printf("\n Familiar with these tools: \n");
		for (String tool: programmingTools) 
			System.out.println("  " + tool);
		System.out.printf("\n  Code samples: %s\n", publicRepositories);
	}
	
	void employment () {
		String professionalProfile = "linkedin.com/in/israelvicars";
		String[][] experiences = {
				{"Gravit8", "Partner", "01/2014 - 03/2015"}, 
				{"Evtron", "COO", "10/2012 - 11/2013"}, 
				{"Cultivation Capital", "Associate Partner", "02/2012 - 12/2012"},
				{"AEGIS Prof. Services", "Director of Online Media", "12/2011 - 05/2012"},
				{"Revenue Trades", "Director of Operations", "01/2011 - 11/2011"},
				{"Gust.com", "Community Manager", "12/2009 - 07/2011"},
				{"University of Michigan", "Student Coordinator", "01/2008 - 07/2009"}};

		System.out.println("\nEmployment: ");
		System.out.printf("\n Professional Profile: %s\n", professionalProfile);
		System.out.println("\n Positions: ");
		for (String[] exp : experiences)
				System.out.printf("  %s at %s (%s)\n", exp[1], exp[0], exp[2]);
	}
	
	void education () {
		String college = "University of Michigan";
		String program = "Interdisciplinary Engineering";
		int[] attendance = {2003, 2008};
		String[] focii = {"Industrial & Operations Engineering","Entrepreneurship"};
		
		System.out.println("\nEducation: \n");
		System.out.printf(" Majored in %s at the %s\n Studied from %d to %d\n", 
				program, college, attendance[0], attendance[1]);
		System.out.printf(" Technical focus: %s\n Professional focus: %s\n", 
				focii[0], focii[1]);
	}

	public static void main (String[] arguments) {
		Resume meetIsraelVicars = new Resume();
		meetIsraelVicars.contact();
		meetIsraelVicars.programming();
		meetIsraelVicars.employment();
		meetIsraelVicars.education();	
	}
}