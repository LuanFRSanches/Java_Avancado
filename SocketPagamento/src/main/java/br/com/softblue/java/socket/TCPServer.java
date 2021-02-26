package br.com.softblue.java.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.NumberFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class TCPServer {

	public static void main(String[] args) throws Exception {

		ServerSocket socket = new ServerSocket(2323);
		while (true) {
			System.out.println("Aguardando requisições...");
			Socket clienteSockett = socket.accept();

			PrintWriter out = new PrintWriter(clienteSockett.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clienteSockett.getInputStream()));

			String tipo = in.readLine();
			if (tipo.endsWith("PAGAMENTO")) {
				processarPagamento(in, out);
			} else {
				// Processar outros tipos de requisição
			}
		}
	}

	private static void processarPagamento(BufferedReader in, PrintWriter out) {
		int qtde;
		try {
			 qtde = Integer.parseInt(in.readLine());
		} catch (Exception e) {
			out.println("FALHA " + e.getMessage());
			return;
		}

		for (int i = 0; i < qtde; i++) {
			try {
				String pagtoStr = in.readLine();

				String[] tokens = pagtoStr.split(";");

				String nome = tokens[0];
				String numeroCartao = tokens[1];
				YearMonth dataValidadeCartao = YearMonth.parse(tokens[2], DateTimeFormatter.ofPattern("MM/yyyy"));
				int parcelas = Integer.parseInt(tokens[3]);
				double valor = Double.parseDouble(tokens[4]);

				System.out.println("Nome:  " + nome);
				System.out.println("Número do cartão:  " + numeroCartao);
				System.out.println("Data de validade do cartão:  " + dataValidadeCartao);
				System.out.println("Parcelas:  " + parcelas);
				System.out.println("Valor: " + NumberFormat.getCurrencyInstance().format(valor));

				out.println("OK");
			} catch (Exception e) {
				out.println("FALHA " + e);
			}
		}

	}

}
