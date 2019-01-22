package pl.sda.Enumy;

public enum GamesProducents {
    EASPORTS(0,"EASPORTS"),HUUUGEGAME(1,"HUUUGEGAME"),CDPROJECT(3,"CDPROJECT"),BLIZZARD(4,"BLIZZARD");

    private Integer producentID;
    private String prodycentName;

    GamesProducents(Integer producentID, String prodycentName) {
        this.producentID = producentID;
        this.prodycentName = prodycentName;
    }

    public Integer getProducentID() {
        return producentID;
    }

    public GamesProducents setProducentID(Integer producentID) {
        this.producentID = producentID;
        return this;
    }

    public String getProdycentName() {
        return prodycentName;
    }

    public GamesProducents setProdycentName(String prodycentName) {
        this.prodycentName = prodycentName;
        return this;
    }
}
