package com.everis.mvppj.util;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.mvppj.model.ClientMember;
import com.everis.mvppj.model.Developer;
import com.everis.mvppj.model.LTF;
import com.everis.mvppj.model.Lider;
import com.everis.mvppj.model.Person;
import com.everis.mvppj.model.RT;
import com.everis.mvppj.model.Squad;
import com.everis.mvppj.repository.DeveloperRepository;

public class Util {
	
	@Autowired
	private static DeveloperRepository developerRepository;

	private static int randomiza(int n) {
        int ranNum = (int) (Math.random() * n);
		return ranNum;
	}

	private static int mod(int dividendo, int divisor) {
		return (int) Math.round(dividendo - (Math.floor(dividendo / divisor) * divisor));
	}

	public static String cpf(boolean comPontos) {
		int n = 9;
		int n1 = randomiza(n);
		int n2 = randomiza(n);
		int n3 = randomiza(n);
		int n4 = randomiza(n);
		int n5 = randomiza(n);
		int n6 = randomiza(n);
		int n7 = randomiza(n);
		int n8 = randomiza(n);
		int n9 = randomiza(n);
		int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

		d1 = 11 - (mod(d1, 11));

		if (d1 >= 10)
			d1 = 0;

		int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

		d2 = 11 - (mod(d2, 11));

		String retorno = null;

		if (d2 >= 10)
			d2 = 0;
		retorno = "";

		if (comPontos)
			retorno = "" + n1 + n2 + n3 + '.' + n4 + n5 + n6 + '.' + n7 + n8 + n9 + '-' + d1 + d2;
		else
			retorno = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

		return retorno;
	}
	
	public static Person preenchePessoa(Person p) {
		p.setNome("Teste"+Math.random()*10);
		p.setBirthDate(LocalDate.now());
		p.setCpf(Util.cpf(false));
		p.setMatriculaGECO((int) (Math.random()*10000000));
		p.setRateGECO((int) (Math.random()*1000000));
		p.setTelephone("1111111111111");
		p.setAvatar("https://avatars.dicebear.com/api/bottts/"+p.getNome()+".svg");
		return p;
	}
	
	public static Developer geraDev() {
		Developer dev = new Developer();
		dev = (Developer) Util.preenchePessoa(dev);
		dev.setFuncional((int) (Math.random()*1000000));
		dev.setNumeroCorporativo((int) (Math.random()*1000000));
		dev.setMacAddress("TESTE MAC");
		dev.setNumeroCorporativo((int) (Math.random()*1000000));
		dev.setPRE("TESTE");
		dev.setProjetoJira("JIRA");
		dev.setRacf("testeRACF");
		return dev;
	}
	public static Developer addShadow(Developer dev) {
		Developer shadow = geraDev();
		shadow = (Developer) Util.preenchePessoa(shadow);
		shadow.setNome("Shadow de " + dev.getNome());
		developerRepository.save(shadow);
		dev.setShadow(shadow);
		return dev;
	}
	
	public static ClientMember geraCliente() {
		ClientMember cm = new ClientMember();
		cm.setEmail("teste@itau.com.br");
		cm.setName("Teste Cliente " + Math.random() * 10);
		cm.setRACF("Teste RACF");
		return cm;
	}
	
	public static Squad geraSquad() {
		Squad squad = new Squad();
		squad.setName("Teste Squad");
		squad.setProductOwner(geraCliente());
		squad.setTeamLead(geraCliente());
		squad.setTechLead(geraCliente());
		squad.setUrlAgenda("google.com.br");
		
		return squad;
	}
	
	public static RT geraRT(List<Squad> squads, LTF ltf, Lider lider) {
		RT rt = new RT();
		rt.setLider(lider);
		rt.setLtf(ltf);
		rt.setSquads(squads);
		return rt;
	}
}
