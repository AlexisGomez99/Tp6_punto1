package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

import modelo.Observer;

public class EnDisco implements Observer{
	private String path;
	public EnDisco(String path) {
		this.path=path;
	}

	@Override
	public void actualizar(String valor) {
		String nuevoValor= valor+" | "+ LocalDate.now()+"\n";
		File file= new File(path);
		verificar(file);
		try {
			Files.write(Paths.get(file.getAbsolutePath()), nuevoValor.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage(),e);
		}
		
	}

	private void verificar(File file) {
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException(e.getMessage(),e);
			}
		}
		
	}

}
