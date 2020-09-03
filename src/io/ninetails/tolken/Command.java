package io.ninetails.tolken;

public interface Command {
    public abstract void execute();

    public abstract Command parse(String code, int position);

}
