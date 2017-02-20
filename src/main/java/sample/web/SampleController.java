package sample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.domain.mapper.ParentMapper;
import sample.domain.model.Parent;
import sample.domain.model.ParentExample;

import java.util.List;

/**
 *
 */
@RestController
public class SampleController {

    @Autowired
    ParentMapper parentMapper;

    @RequestMapping("/")
    public List<Parent> index() {
        return parentMapper.selectByExample(new ParentExample());
    }
}
