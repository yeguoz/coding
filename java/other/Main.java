package other;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取第一行的m和n
        String[] firstLine = scanner.nextLine().split(" ");
        int m = Integer.parseInt(firstLine[0]);
        int n = Integer.parseInt(firstLine[1]);

        // 检查输入是否合理
        if (n >= m || n >= 200 || m <= 0 || n <= 0) {
            System.out.println("输入数据有误");
            return;
        }

        List<Student> students = new ArrayList<>();

        // 读取m个学生的信息
        for (int i = 0; i < m; i++) {
            String[] studentData = scanner.nextLine().split(" ");
            int id = Integer.parseInt(studentData[0]);         // 学号
            int totalScore = Integer.parseInt(studentData[1]); // 总分
            int englishScore = Integer.parseInt(studentData[2]); // 英语分
            students.add(new Student(id, totalScore, englishScore));
        }

        Collections.sort(students, (s1, s2) -> {
            if (s1.totalScore != s2.totalScore) {
                return s2.totalScore - s1.totalScore;  // 总分降序
            }
            if (s1.englishScore != s2.englishScore) {
                return s2.englishScore - s1.englishScore;  // 英语分降序
            }
            return s1.id - s2.id;  // 学号升序
        });

        for (int i = 0; i < n; i++) {
            System.out.println(students.get(i));
        }
    }
}
