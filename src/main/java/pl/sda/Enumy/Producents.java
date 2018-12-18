package pl.sda.Enumy;

public enum Producents {
    EASPORT(0, "EASPORT"), HUUUGAME(1, "HUUUGAME"),
    CDPROJECT (2, "CDPORJECT"), BLIZZARD (3, "BLIZZARD");

    private Integer producentId;
    private String producentName;

    Producents(Integer producentId, String producentName) {
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
