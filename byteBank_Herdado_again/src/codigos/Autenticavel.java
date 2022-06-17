package codigos;

public abstract interface Autenticavel {

    protected abstract void setSenha(int senha);

    protected abstract boolean autentica(int senha);

}