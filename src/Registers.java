public class Registers {
    private int PTR, R, P, IP, CS, SS, SP, IR, TI, RE, CHST1, CHST2, CHST3, MODE, ERR, CF, ZF,SF;
    private String RS = "        ";
//SETERIAI


    public void setRS(String RS) {
        if(RS.length()>8){
            System.out.println("Registro RS reikšmė netelpa į rėžius!");
        } else {
            this.RS = RS;
        }
    }

    public void setP(int P) {
        if(P>99999999){
            System.out.println("Registro P reikšmė netelpa į rėžius!");
        } else {
            this.P = P;
        }
    }

    public void setCF(int CF) {
        if(CF>9||(CF!=0&&CF!=1)){
            System.out.println("Netinkama registro CF reikšmė!");
        } else {
            this.CF = CF;
        }
    }

    public void setZF(int ZF) {
        if(ZF>9||(ZF!=0&&ZF!=1)){
            System.out.println("Netinkama registro ZF reikšmė!");
        } else {
            this.ZF = ZF;
        }
    }

    public int getCF() {
        return CF;
    }

    public int getZF() {
        return ZF;
    }

    public void setCS(int CS) {
        if(CS>9999){
            System.out.println("Registro CS reikšmė netelpa į rėžius!");
        } else {
            this.CS = CS;
        }
    }
    public void setIP(int IP) {
        if(IP>9999){
            System.out.println("Registro IP reikšmė netelpa į rėžius!");
        } else {
            this.IP = IP;
        }
    }
    public void setPTR(int PTR) {
        if(PTR>9999){
            System.out.println("Registro PTR reikšmė netelpa į rėžius!");
        } else {
            this.PTR = PTR;
        }
    }
    public void setR(int R) {
        if(R>99999999){
            System.out.println("Registro R reikšmė netelpa į rėžius!");
        } else {
            this.R = R;
        }
    }

    public void setSS(int SS) {
        if(SS>9999){
            System.out.println("Registro SS reikšmė netelpa į rėžius!");
        } else {
            this.SS = SS;
        }
    }
    public void setSP(int SP) {
        if(SP>9999){
            System.out.println("Registro SP reikšmė netelpa į rėžius!");
        } else {
            this.SP = SP;
        }
    }
    public void setIR(int IR) {
        if(IR>99){
            System.out.println("Registro IR reikšmė netelpa į rėžius!");
        } else {
            this.IR = IR;
        }

        setIP(IR);
    }
    public void setTI(int TI) {
        if(TI>99){
            System.out.println("Registro TI reikšmė netelpa į rėžius!");
        } else {
            this.TI = TI;
        }
        //pertraukimas jei TI ==0??
    }
    public void setRE(int RE) {
        if(RE>99){
            System.out.println("Registro RE reikšmė netelpa į rėžius!");
        } else {
            this.RE = RE;
        }
    }
    public void setERR(int ERR) {
        if(ERR>99){
            System.out.println("Registro ERR reikšmė netelpa į rėžius!");
        } else {
            this.ERR = ERR;
        }
    }
    public void setSF(int SF) {
        if(SF>9||(SF!=0&&SF!=1)){
            System.out.println("Netinkama registro SF reikšmė!");
        } else {
            this.SF = SF;
        }
    }
    public void setCHST1(int CHST1) {
        if(CHST1>9||(CHST1!=0&&CHST1!=1)){
            System.out.println("Netinkama registro CHST1 reikšmė!");
        } else {
            this.CHST1 = CHST1;
        }
    }
    public void setCHST2(int CHST2) {
        if(CHST2>9||(CHST2!=0&&CHST2!=1)){
            System.out.println("Netinkama registro CHST2 reikšmė!");
        } else {
            this.CHST2 = CHST2;
        }
    }
    public void setCHST3(int CHST3) {
        if(CHST3>9||(CHST3!=0&&CHST3!=1)){
            System.out.println("Netinkama registro CHST3 reikšmė!");
        } else {
            this.CHST3 = CHST3;
        }
    }
    public void setMODE(int MODE) {
        if(MODE>9||(MODE!=0&&MODE!=1)){
            System.out.println("Netinkama registro MODE reikšmė!");
        } else {
            this.MODE = MODE;
        }
    }

    //GETERIAI


    public String getRS() {
        return RS;
    }
    public int getCHST1() {
        return CHST1;
    }

    public int getCS() {
        return CS;
    }

    public int getCHST2() {
        return CHST2;
    }

    public int getIP() {
        return IP;
    }

    public int getCHST3() {
        return CHST3;
    }

    public int getIR() {
        return IR;
    }

    public int getPTR() {
        return PTR;
    }

    public int getMODE() {
        return MODE;
    }

    public int getR() {
        return R;
    }

    public int getRE() {
        return RE;
    }


    public int getSP() {
        return SP;
    }

    public int getSS() {
        return SS;
    }

    public int getTI() {
        return TI;
    }

    public int getERR() {
        return ERR;
    }

    public int getSF() {
        return SF;
    }

    public int getP() {
        return P;
    }

    public void SETCH(int register){
        if(register==1){
            setCHST1(1);
        } else if (register==2){
            setCHST2(1);
        } else if (register==3){
            setCHST3(1);
        } else {
            System.out.println("Neegzistuoja toks kanalas!");
        }
    }
    public void CLRCH(int register){
        if(register==1){
            setCHST1(0);
        } else if (register==2){
            setCHST2(0);
        } else if (register==3){
            setCHST3(0);
        } else {
            System.out.println("Neegzistuoja toks kanalas!");
        }
    }
    public void INC(String register){
        //switch
        if(register.equals("TI")){
            setTI(getTI()+1);
        } else if(register.equals("SP")){
            setSP(getSP()+1);
        } else if(register.equals("IP")){
            setIP(getIP()+1);
        } else {
            System.out.println("Neegzistuoja tos registras!");
        }
    }
    public void DEC(String register){
        if(register.equals("TI")){
            setTI(getTI()-1);
            //pertrraukimas jei TI = 0??
        } else if(register.equals("SP")){
            setSP(getSP()-1);
        } else if(register.equals("IP")){
            setIP(getIP()-1);
        } else {
            System.out.println("Neegzistuoja tos registras!");
        }
    }
}
