package RecordProject;

public class RecordProject {

    public static void main(String[] args) {
        Student nick = new Student("1", "Nick Koko", "09/28/1997", "dfhlgd");

        for (int i = 1; i <= 5; i++){
            LPAStudent s = new LPAStudent("S39846" + i,
                    switch (i){
                    case 1 -> "Mary";
                    case 2 -> "Carol";
                    case 3 -> "Tim";
                    case 4 -> "Harry";
                    case 5 -> "Lisa";
                        default -> "Anon";
            }, "05/11/1985",
                    "Java Masterclass");
            System.out.println(s.toString());
            Student pojo = new Student("347662", "Nic", "02/12/23", "Java");
            LPAStudent recod = new LPAStudent("347662", "Nicholas", "02/12/23", "Java");
            System.out.println(pojo);
            System.out.println(recod);
        }
    }
}
