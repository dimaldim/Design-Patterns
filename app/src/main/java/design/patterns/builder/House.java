package design.patterns.builder;

public class House {

    private final String foundation;
    private final String structure;
    private final String roof;
    private final boolean furnished;
    private final boolean painted;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.furnished = builder.furnished;
        this.painted = builder.painted;
    }

    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public boolean isPainted() {
        return painted;
    }

    public static class HouseBuilder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean furnished;
        private boolean painted;

        public HouseBuilder foundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder structure(String structure) {
            this.structure = structure;
            return this;
        }

        public HouseBuilder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder furnished(boolean furnished) {
            this.furnished = furnished;
            return this;
        }

        public HouseBuilder painted(boolean painted) {
            this.painted = painted;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", furnished=" + furnished +
                ", painted=" + painted +
                '}';
    }
}
