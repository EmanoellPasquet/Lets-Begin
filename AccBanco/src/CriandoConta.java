import java.math.BigDecimal;

public class CriandoConta {

	private String numero;
	private String agencia;
	private BigDecimal saldo;
	private String nome;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public CriandoConta(String nome){
		this(nome,"","");
	}
		
	public CriandoConta(String numero, String agencia, String nome){
		this.nome=nome;
		this.saldo=new BigDecimal("0.0");
		this.numero=numero;
		this.agencia=agencia;
	}
	public boolean consultarSaldo(BigDecimal valor){
		boolean sucesso=false;
		if(this.saldo.compareTo(valor)>0){
			this.saldo=this.saldo.subtract(valor);
		}
		return sucesso;
	}
}


