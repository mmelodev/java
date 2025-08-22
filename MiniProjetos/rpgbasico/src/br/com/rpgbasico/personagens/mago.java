package br.com.rpgbasico.personagens;

public class mago extends geral{
    private boolean senioridade;
    private String escolaArcana;
    private String habilidadePrimaria;
    private String habilidadeSecundaria;

    public boolean getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(boolean senioridade) {
        this.senioridade = senioridade;
    }

    public String getEscolaArcana() {
        return escolaArcana;
    }

    public void setEscolaArcana(String escolaArcana) {
        this.escolaArcana = escolaArcana;
    }

    public String getHabilidadePrimaria() {
        return habilidadePrimaria;
    }

    public void setHabilidadePrimaria(String habilidadePrimaria) {
        this.habilidadePrimaria = habilidadePrimaria;
    }

    public String getHabilidadeSecundaria() {
        return habilidadeSecundaria;
    }

    public void setHabilidadeSecundaria(String habilidadeSecundaria) {
        this.habilidadeSecundaria = habilidadeSecundaria;
    }
}
