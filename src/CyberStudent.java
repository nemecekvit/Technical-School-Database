import java.time.LocalDate;
import java.util.List;

public class CyberStudent extends Student {
    public CyberStudent (int id, String name, String surename, LocalDate birthDate, List<Integer> grades, Specialisation specialisation) {
        super(id, name, surename, birthDate, grades, specialisation);
    }

    @Override
    public void getCodedIdentity() {
        //return hashSolve(name + surename);
        return;
    }
}
