package exceptions;

public class ResourceNotFoundException  extends RuntimeException{

    public ResourceNotFoundException(Long codManga)
    {
        super("Não existe um manga com esse código: " + codManga);
    }
}
