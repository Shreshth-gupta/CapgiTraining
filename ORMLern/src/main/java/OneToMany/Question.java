package OnetoManye;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int qid;
    private  String lavel;
    private String questionName;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answer;

    public Question() {
    }

    public void setLavel(String lavel) {
        this.lavel = lavel;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public String getLavel() {
        return lavel;
    }

    public int getQid() {
        return qid;
    }

    public String getQuestionName() {
        return questionName;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public Question(String lavel, String questionName) {
        this.lavel = lavel;
        this.questionName = questionName;
    }

    public Question(String lavel, String questionName, List<Answer> answer) {
        this.lavel = lavel;
        this.questionName = questionName;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qid=" + qid +
                ", lavel='" + lavel + '\'' +
                ", questionName='" + questionName + '\'' +
                ", answer=" + answer +
                '}';
    }
}
