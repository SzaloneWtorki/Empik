package pl.sda.enumy;

public enum GamesProducents {

    EASPORTS (0, "EASPORTS"), HUUUGEGAMES (1, "HUUUGEGAMES"), CDPROJEKT (2, "CDPROJEKT"), BLIZZARD (3, "BLIZZARD");

    private Integer producentId;
    private String producentName;


    GamesProducents(Integer producentId, String producentName) {
        this.producentId = producentId;
        this.producentName = producentName;
    }

    public Integer getProducentId() {
        return producentId;
    }

    public void setProducentId(Integer producentId) {
        this.producentId = producentId;
    }

    public String getProducentName() {
        return producentName;
    }

    public void setProducentName(String producentName) {
        this.producentName = producentName;
    }
}
