public class PublisherMember extends Member {
    private String companyName;

    public PublisherMember(String memberId, String name, String companyName) {
        super(memberId, name);
        this.companyName = companyName;
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    @Override
    public double calculateFees() {
        return FLAT_FEE + (0.05 * FLAT_FEE) + 20000;
    }

    @Override
    public String toString() {
        return "PublisherMember{" + super.toString() +
               ", companyName='" + companyName + "', fees=" + calculateFees() + "}";
    }
}