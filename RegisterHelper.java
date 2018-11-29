package pedro.br.myapplication;

import android.widget.EditText;
import android.widget.Spinner;

import pedro.br.myapplication.modelo.Usuario;


public class RegisterHelper {

    private final EditText campoNome;
    
    private final EditText campoIdade;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoSus;
    private final EditText campoConvenio;
    private final EditText campoContato1;
    private final EditText campoContato2;
    private final EditText campoSangue;
    private final EditText campoAlergia;
    private final EditText campoMedicamento;


    public RegisterHelper(RegisterActivity activity){
        campoNome = (EditText) activity.findViewById(R.id.register_nome);
        campoIdade =  (EditText) activity.findViewById(R.id.register_idade);
        campoEndereco = (EditText) activity.findViewById(R.id.register_endereco);
        campoTelefone = (EditText) activity.findViewById(R.id.register_telefone);
        campoSus = (EditText) activity.findViewById(R.id.register_sus);
        campoConvenio = (EditText) activity.findViewById(R.id.register_convenio);
        campoContato1 = (EditText) activity.findViewById(R.id.register_contato1);
        campoContato2 = (EditText) activity.findViewById(R.id.register_contato2);
        campoSangue = (EditText) activity.findViewById(R.id.register_sangue);
        campoAlergia = (EditText) activity.findViewById(R.id.register_alergia);
        campoMedicamento = (EditText) activity.findViewById(R.id.register_medicamento);

    }

    public Usuario pegaUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNome(campoNome.getText().toString());
        usuario.setIdade(campoIdade.getText().toString());
        usuario.setEndereco(campoEndereco.getText().toString());
        usuario.setTelefone(campoTelefone.getText().toString());
        usuario.setSus(campoSus.getText().toString());
        usuario.setConvenio(campoConvenio.getText().toString());
        usuario.setContato1(campoContato1.getText().toString());
        usuario.setContato2(campoContato2.getText().toString());
        usuario.setSangue(campoSangue.getText().toString());
        usuario.setAlergia(campoAlergia.getText().toString());
        usuario.setMedicamento(campoMedicamento.getText().toString());

        return usuario;
    }
}
