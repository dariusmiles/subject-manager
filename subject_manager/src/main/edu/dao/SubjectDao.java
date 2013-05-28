package main.edu.dao;

import java.util.List;

import main.edu.model.Subject;

public interface SubjectDao {
	public void add(Subject subject);
	public void update(Subject subject);
	public void delete(String code);
	public Subject get(String code);
	public List<Subject> getAll();
}
