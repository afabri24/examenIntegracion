package mx.uv.examenrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

import mx.uv.examenrest.Alumno;

@RestController
@SpringBootApplication
public class ExamenrestApplication {
	List<Alumno> lista = new ArrayList<Alumno>();

	public static void main(String[] args) {
		SpringApplication.run(ExamenrestApplication.class, args);
	}

	@RequestMapping(value="/alumnos", method=RequestMethod.GET)
	public List<Alumno> alumnosGet (){
		return lista;
	}
	@RequestMapping(value="/alumnos", method=RequestMethod.POST)
	public void alumnosPost (String nombre, String apellido, int edad, String matricula){
		Alumno a = new Alumno(nombre, apellido, edad, matricula);
		lista.add(a);
	}
}
