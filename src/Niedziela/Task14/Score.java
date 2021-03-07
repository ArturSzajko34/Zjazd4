package Niedziela.Task14;

public class Score {

    private String timestamp;
    private String winner;
    private String looser;

    public Score(String timestamp, String winner, String looser) {
        this.timestamp = timestamp;
        this.winner = winner;
        this.looser = looser;
    }


    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getLooser() {
        return looser;
    }

    public void setLooser(String looser) {
        this.looser = looser;
    }

    @Override
    public String toString() {
        return "Score{" +
                "timestamp='" + timestamp + '\'' +
                ", winner='" + winner + '\'' +
                ", looser='" + looser + '\'' +
                '}';
    }
}
