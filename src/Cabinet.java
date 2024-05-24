public class Cabinet {
    private Orthophoniste ortho;

    public Cabinet(Orthophoniste ortho) {
        this.ortho = ortho;
    }

    public Orthophoniste connect(String email, String password) throws Exception{
        if (!email.equals(ortho.getMail())) {
            throw new Exception("Unvalid orthophonist");
        }

        if (! ortho.auth(password)) {
            throw  new Exception("Wrong Password");
        }

        return this.ortho;
    }
}
