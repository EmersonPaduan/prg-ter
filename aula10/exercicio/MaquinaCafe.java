package exercicio;

public class MaquinaCafe {
    public final int MAX_AGUA = 950;
    public final int AGUA_PEQ = 50;
    public final int AGUA_MED = 80;
    public final int AGUA_GRD = 100;
    public final int MAX_CAPSULAS = 4;
    private int reservatorioCapsulas;
    private int aguaReservatorio;

    public MaquinaCafe() {
    }

    public MaquinaCafe(int agua) {
        abastecerAgua(agua);
    }

    public int getAguaReservatorio() {
        return aguaReservatorio;
    }

    public int getReservatorioCapsulas() {
        return reservatorioCapsulas;
    }

    public void abastecerAgua(int agua) {
        if(agua > 0) {
            if(aguaReservatorio + agua > MAX_AGUA) { 
                aguaReservatorio = MAX_AGUA;
            } else {
                aguaReservatorio += agua;
            }
        }
    }

    public void esvaziarReservatorio() {
        reservatorioCapsulas = 0;
    }

    public void fazerCafePequeno() throws Exception {
        if(aguaReservatorio < AGUA_PEQ) {
            throw new Exception("Água insuficiente");
        }
        if(reservatorioCapsulas == MAX_CAPSULAS) {
            throw new Exception("Reservatório de capsulas cheio");
        }
        aguaReservatorio -= AGUA_PEQ;
        reservatorioCapsulas++;
    }

    public void fazerCafeMedio() throws Exception {
        if(aguaReservatorio < AGUA_MED) {
            throw new Exception("Água insuficiente");
        }
        if(reservatorioCapsulas == MAX_CAPSULAS) {
            throw new Exception("Reservatório de capsulas cheio");
        }
        aguaReservatorio -= AGUA_MED;
        reservatorioCapsulas++;
    }

    public void fazerCafeGrande() throws Exception {
        if(aguaReservatorio < AGUA_GRD) {
            throw new Exception("Água insuficiente");
        }
        if(reservatorioCapsulas == MAX_CAPSULAS) {
            throw new Exception("Reservatório de capsulas cheio");
        }
        aguaReservatorio -= AGUA_GRD;
        reservatorioCapsulas++;
    }

}
