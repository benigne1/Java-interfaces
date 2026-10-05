public class StudentMember extends Member {
    private String studentId;

    public StudentMember(String memberId, String name, String studentId) {
        super(memberId, name);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    @Override
    public double calculateFees() {
        boolean idExists = studentId != null && !studentId.trim().isEmpty();
        if (idExists) {
            return 0;
        } else {
            return FLAT_FEE;
        }
    }

    @Override
    public String toString() {
        return "StudentMember{" + super.toString() +
               ", studentId='" + studentId + "', fees=" + calculateFees() + "}";
    }
}
