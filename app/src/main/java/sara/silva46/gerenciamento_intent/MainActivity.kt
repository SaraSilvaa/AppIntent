package sara.silva46.gerenciamento_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btContato:Button;
    lateinit var btLocal:Button;
    lateinit var btSite:Button;
    lateinit var btNovaTela:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btContato = findViewById(R.id.btContato)
        btLocal = findViewById(R.id.btLocal)
        btSite = findViewById(R.id.btSite)
        btNovaTela = findViewById(R.id.btNovaTela)

        btContato.setOnClickListener { exibirContatos() }
        btLocal.setOnClickListener { exibirLocal() }
        btSite.setOnClickListener { exibirSite() }
        btNovaTela.setOnClickListener { exibirNovaTela() }

    }

    private fun exibirNovaTela() {
        val intent:Intent = Intent(baseContext, Tela2Activity::class.java)
        startActivity(intent)
    }

    private fun exibirSite() {
        var dados = Uri.parse("https://www.google.com")
        val intent:Intent = Intent(Intent.ACTION_VIEW,dados)
        startActivity(intent)
    }

    private fun exibirLocal() {
        var dados = Uri.parse("geo:-23.664310677173127, -46.46063457221708?z=19")
        val intent:Intent = Intent(Intent.ACTION_VIEW,dados)
        startActivity(intent)
    }

    private fun exibirContatos() {
        var dados = Uri.parse("content://contacts/people/1")
        val intent:Intent = Intent(Intent.ACTION_VIEW,dados)
        startActivity(intent)
    }
}