
package hib.software.beans;

public class JavaExam 
{
    private String Technologyname;
    private int qno;
    private String qdis;
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
    private String correctchoice;

    public JavaExam() {
    }

    public JavaExam(String Technologyname,  String qdis, String choice1, String choice2, String choice3, String choice4, String correctchoice) {
        this.Technologyname = Technologyname;
        this.qno = qno;
        this.qdis = qdis;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.choice4 = choice4;
        this.correctchoice = correctchoice;
    }

    /**
     * @return the Technologyname
     */
    public String getTechnologyname() {
        return Technologyname;
    }

    /**
     * @param Technologyname the Technologyname to set
     */
    public void setTechnologyname(String Technologyname) {
        this.Technologyname = Technologyname;
    }

    /**
     * @return the qno
     */
    public int getQno() {
        return qno;
    }

    /**
     * @param qno the qno to set
     */
    public void setQno(int qno) {
        this.qno = qno;
    }

    /**
     * @return the qdis
     */
    public String getQdis() {
        return qdis;
    }

    /**
     * @param qdis the qdis to set
     */
    public void setQdis(String qdis) {
        this.qdis = qdis;
    }

    /**
     * @return the choice1
     */
    public String getChoice1() {
        return choice1;
    }

    /**
     * @param choice1 the choice1 to set
     */
    public void setChoice1(String choice1) {
        this.choice1 = choice1;
    }

    /**
     * @return the choice2
     */
    public String getChoice2() {
        return choice2;
    }

    /**
     * @param choice2 the choice2 to set
     */
    public void setChoice2(String choice2) {
        this.choice2 = choice2;
    }

    /**
     * @return the choice3
     */
    public String getChoice3() {
        return choice3;
    }

    /**
     * @param choice3 the choice3 to set
     */
    public void setChoice3(String choice3) {
        this.choice3 = choice3;
    }

    /**
     * @return the choice4
     */
    public String getChoice4() {
        return choice4;
    }

    /**
     * @param choice4 the choice4 to set
     */
    public void setChoice4(String choice4) {
        this.choice4 = choice4;
    }

    /**
     * @return the correctchoice
     */
    public String getCorrectchoice() {
        return correctchoice;
    }

    /**
     * @param correctchoice the correctchoice to set
     */
    public void setCorrectchoice(String correctchoice) {
        this.correctchoice = correctchoice;
    }
    
}

