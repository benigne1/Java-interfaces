public class LibrarianMember extends Member {
    private String staffCode;

    public LibrarianMember(String memberId, String name, String staffCode) {
        super(memberId, name);
        this.staffCode = staffCode;
    }

    public String getStaffCode() { return staffCode; }
    public void setStaffCode(String staffCode) { this.staffCode = staffCode; }

    @Override
    public double calculateFees() {
        return 0;
    }

    @Override
    public String toString() {
        return "LibrarianMember{" + super.toString() +
               ", staffCode='" + staffCode + "', fees=" + calculateFees() + "}";
    }
}