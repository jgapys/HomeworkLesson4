public enum Segment {
    STANDARD("standard"),
    MEDIUM("medium"),
    PREMIUM("premium");
    private final String segmentName;

    Segment(String segmentName) {
        this.segmentName = segmentName;
    }

    public String getSegmentName() {
        return segmentName;
    }

    @Override
    public String toString() {
        return this.getSegmentName();
    }
}