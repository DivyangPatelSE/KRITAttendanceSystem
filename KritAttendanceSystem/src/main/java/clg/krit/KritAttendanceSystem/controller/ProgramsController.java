package clg.krit.KritAttendanceSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import clg.krit.KritAttendanceSystem.model.Programs;
import clg.krit.KritAttendanceSystem.service.ProgramsService;

@RestController
public class ProgramsController {

	@Autowired
	ProgramsService programsService;

	@RequestMapping(value = "/programs", method = RequestMethod.POST)
	public List<Programs> getPrograms() {
		return programsService.getAllPrograms();
	}

	public Programs findProgramById(String programsId){
		return programsService.getProgramsById(programsId);
	}
	
}
