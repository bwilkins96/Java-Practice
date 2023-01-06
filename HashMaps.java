import java.util.HashMap;

class HashMaps{
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Biology", 100);
        examScores.put("Computer Programming", 100);

        examScores.putIfAbsent("Math", 90);
        examScores.putIfAbsent("Physics", 80);

        System.out.println(examScores.toString());
        System.out.println(examScores.get("Biology") + "\n");

        examScores.replace("Math", 90);
        examScores.remove("Sociology");

        System.out.println(examScores.get("Philosopy")); // getOrDefault();
        System.out.println(examScores.toString());
        System.out.println(examScores.containsKey("Computer Programming"));
        System.out.println(examScores.containsValue(100));
        System.out.println(examScores.size() + "\n");

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });

        examScores.clear();
        System.out.println("\n" + examScores.toString());
        System.out.println(examScores.isEmpty());
    }
}