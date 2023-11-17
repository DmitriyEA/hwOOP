package hwSeminar05.controller;

import hwSeminar05.model.Student;
import hwSeminar05.model.Teacher;
import hwSeminar05.model.WorkGroup;
import hwSeminar05.service.UserService;
import hwSeminar05.service.WorkGroupService;

import java.util.List;

public class WorkGroupController implements UserController<WorkGroup> {
    public UserService<WorkGroup> workGroupService;

    public WorkGroupController(WorkGroupService workGroupService) {
        this.workGroupService = (UserService<WorkGroup>) workGroupService;
    }

    @Override
    public void create(Teacher teacher, List<Student> studentsList) {
        workGroupService.create(teacher, studentsList);
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {

    }

    @Override
    public List<WorkGroup> getAllSortUsers() {
        return null;
    }

    @Override
    public List<WorkGroup> getAllSortUsersByFamilyName() {
        return null;
    }

    @Override
    public boolean removeUser(String fullName) {
        return false;
    }

    @Override
    public List<WorkGroup> getAll() {
        return WorkGroupService.getAll();
    }

    @Override
    public List<WorkGroup> getAllSortUsersByAge() {
        return null;
    }
}