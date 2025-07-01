class Hospital {
    static String doctorNames[] = {"Dr. Mehta", "Dr. Rao", "Dr. Khan", "Dr. Singh", "Dr. Sharma", "Dr. Reddy", "Dr. Iyer", "Dr. Das", "Dr. Patil", "Dr. Nair"};

    public static void main(String Hospital[]) {
        System.out.println("The Number of doctors are:");
        for(String doctorName: doctorNames){
			System.out.println(doctorName);
		}
    }
}
