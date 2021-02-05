package cn.timelost.hr.service;

import cn.timelost.hr.pojo.PersonalTrain;
import cn.timelost.hr.pojo.Position;
import cn.timelost.hr.vo.PositionSelectVo;
import cn.timelost.hr.vo.input.PersonalTrainForm;
import cn.timelost.hr.vo.input.PositionForm;
import com.github.pagehelper.PageInfo;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author: Jyf
 * @Date: 2021/2/2 16:24
 */
public interface PersonalTrainService {

    PageInfo<PersonalTrain> findAll(int pageNum, int pageSize, String departmentName, Integer personalId);

    PageInfo<PersonalTrain> searchByDate(Date beginDate, Date endDate, int pageNum, int pageSize);

    PersonalTrain find(int id);

    void insert(PersonalTrainForm personalTrainForm);

    void deleteById(Integer id);

    void deleteByIdIn(Collection<Integer> idList);

    void updateById(Integer id, PersonalTrainForm personalTrainForm);
}
