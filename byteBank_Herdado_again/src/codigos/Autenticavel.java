package codigos;

public abstract interface Autenticavel {

    abstract void setSenha(int senha);

    abstract boolean autentica(int senha);

}