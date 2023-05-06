import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFact {
    @JsonProperty("id")
    private String id;

    @JsonProperty("text")
    private String text;

    @JsonProperty("type")
    private String type;

    @JsonProperty("user")
    private String user;

    @JsonProperty("upvotes")
    private Integer upvotes;

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "CatFact{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", user='" + user + '\'' +
                ", upvotes=" + upvotes +
                '}';
    }
}