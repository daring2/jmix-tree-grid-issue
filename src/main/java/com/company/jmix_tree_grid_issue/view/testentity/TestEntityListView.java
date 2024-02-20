package com.company.jmix_tree_grid_issue.view.testentity;

import com.company.jmix_tree_grid_issue.entity.TestEntity;
import com.company.jmix_tree_grid_issue.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.LoadContext;
import io.jmix.core.Metadata;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static java.util.stream.IntStream.range;

@Route(value = "testEntities", layout = MainView.class)
@ViewController("sb_TestEntity.list")
@ViewDescriptor("test-entity-list-view.xml")
@LookupComponent("testEntitiesDataGrid")
@DialogMode(width = "50em")
public class TestEntityListView extends StandardListView<TestEntity> {

    @Autowired
    Metadata metadata;

    @Install(to = "testEntitiesDl", target = Target.DATA_LOADER)
    protected List<TestEntity> loadEntities(LoadContext<TestEntity> loadContext) {
        return range(0, 5000).mapToObj(i -> {
            var entity = metadata.create(TestEntity.class);
            entity.setCode("code" + i);
            entity.setName("name" + i);
            return entity;
        }).toList();
    }

}
