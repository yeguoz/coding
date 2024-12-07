package other;

public class Student {
    int id;         // 学号
    int totalScore; // 总分
    int englishScore; // 英语分数

    public Student(int id, int totalScore, int englishScore) {
        this.id = id;
        this.totalScore = totalScore;
        this.englishScore = englishScore;
    }
    @Override
    public String toString() {
        return id + " " + totalScore + " " + englishScore;
    }
}
