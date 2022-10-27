package archivo_serial_uno_a_muchos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MiObjectOutputStream extends ObjectOutputStream { //(1)

    public MiObjectOutputStream(OutputStream out) throws IOException { //(2)
        super(out);
    }

    protected MiObjectOutputStream() throws IOException, SecurityException { //(3)
        super();
    }

    protected void writeStreamHeader() throws IOException { //(4)
    }

}
