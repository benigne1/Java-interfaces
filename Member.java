public abstract class Member {
    protected static final double FLAT_FEE = 5000;

    private String memberId;
    private String name;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public abstract double calculateFees();

    @Override
    public String toString() {
        return "memberId='" + memberId + "', name='" + name + "'";
    }
}
