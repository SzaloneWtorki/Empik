package pl.sda.enumy;

public enum GamesProducents {
    EASPORTS(0, "EASPORTS"), HUUUUGAME(1, "HUUUUGAME"),
    CDPROJECT(2, "CDPROJECT"), BLIZZARD(3, "BLIZZARD");

    private Integer producentId;
    private String producentName;

    GamesProducents(Integer producentId, String producentName) {
        this.producentId = producentId;
        this.producentName = producentName;
    }

    public Integer getProducentId() {
        return producentId;
    }

    public GamesProducents setProducentId(Integer producentId) {
        this.producentId = producentId;
        return this;
    }

    public String getProducentName() {
        return producentName;
    }

    public GamesProducents setProducentName(String producentName) {
        this.producentName = producentName;
        return this;
    }
}
