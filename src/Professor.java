public class Professor {
    private String nome;
    private int matricula;
    private int cargaHoraria;

    Professor(String nome, int matricula, int cargaHoraria){
        this.nome=nome;
        this.matricula=matricula;
        this.cargaHoraria=cargaHoraria;
    }

    void setNome(String nome){
        this.nome=nome;
    }

    String getNome(){
        return(nome);
    }

    void setMatricula(int matricula){
        this.matricula=matricula;
    }

    int getMatricula(){
        return(matricula);
    }

    void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria=cargaHoraria;
    }

    int getCargaHoraria(){
        return(cargaHoraria);
    }

    void printProf(){
        System.out.println(nome);
        System.out.println(matricula);
        System.out.println(cargaHoraria);
    }
}
