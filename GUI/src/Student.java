public class Student {
	//attributes
		// private instance variables
		private String name;
		private int score;

		//methods
		public void setName(String Name) {
			name = Name;		
		private String address;
		// The courses and grades for the courses are kept in 2 parallel arrays
		// course[] = {INT108,INT107}; grades[]={89,75};
		private String[] courses;
		private int[] grades; // valid range is [0,100]
		private int numCourses; // numbers of courses taken so far
		// Maximum number of courses taken by student
		private static final int MAX_COURSE = 30;

		/** Constructs a Student instance with given input */
		public Student(String name, String address) {
			this.name = name;
			this.address = address;
			courses = new String[MAX_COURSE]; // allocate arrays
			grades = new int[MAX_COURSE];
			numCourses = 0; // no courses so far
		}


		// The public getters and setters.
		// No setter for name as it is not designed to be changed.
		public String getName() {
			return name;
			return this.name;
		}

		public void setScore(int Score) {
			score = Score;

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String toString() {
			return name + "(" + address + ")";
		}

		public int getScore() {
			return score;
		/**Adds a course and grade*/
		public void addCourseGrade(String course,int grade) {
			courses[numCourses] = course;
			grades[numCourses] = grade;
			++numCourses;
		}

		public boolean checkScore() {
			if(score>=0 && score<=100) 
				return true;
			else 
				return false;			
		/**Prints all courses and their grades*/
		public void printGrades() {
			System.out.print(name); 
			for(int i=0; i<numCourses;i++) {
				System.out.print(" "+courses[i]+":"+grades[i]);			
			}
			System.out.println();
		}

		public boolean isPass() {
			if(score>=50)
				return true;
			else 
				return false;
		/**Computes the average grade*/
		public double getAverageGrade() {
			int sum=0;
			for(int i=0; i<numCourses;i++) {
				sum += grades[i];
			}
			return (double)sum/numCourses;
		}

	}