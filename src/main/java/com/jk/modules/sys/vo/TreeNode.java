package com.jk.modules.sys.vo;

import lombok.Data;

/**'
 * 树对象
 * @author fengj
 * Created by mr on 2017/2/15.
 */
@Data
public class TreeNode {

    /**
     * id
     */
    private Long id;

    /**
     * 父节点ID
     */
    private Long parentId;

    /**
     * 节点名称
     */
    private String name;

    /**
     * 是否展开
     */
    private Boolean open = true;
}
