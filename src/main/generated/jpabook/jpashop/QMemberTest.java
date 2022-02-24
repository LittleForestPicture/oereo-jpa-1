package jpabook.jpashop;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberTest is a Querydsl query type for MemberTest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberTest extends EntityPathBase<MemberTest> {

    private static final long serialVersionUID = 57439251L;

    public static final QMemberTest memberTest = new QMemberTest("memberTest");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath username = createString("username");

    public QMemberTest(String variable) {
        super(MemberTest.class, forVariable(variable));
    }

    public QMemberTest(Path<? extends MemberTest> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberTest(PathMetadata metadata) {
        super(MemberTest.class, metadata);
    }

}

