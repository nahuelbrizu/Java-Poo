public class ExamenOral extends Examen{
    private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(String fecha, NivelSatisfaccion nivelSatisfaccion) {
        super(fecha);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean aprobo() {
        //llamo a el enum desde la pos1 en adelante
        return nivelSatisfaccion.ordinal() == NivelSatisfaccion.SUFIENTE.ordinal();
    }
}
