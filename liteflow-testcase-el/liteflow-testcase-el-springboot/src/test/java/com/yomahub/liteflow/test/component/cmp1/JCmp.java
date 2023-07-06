/**
 * <p>Title: liteflow</p>
 * <p>Description: 轻量级的组件式流程框架</p>
 * @author Bryan.Zhang
 * @email weenyc31@163.com
 * @Date 2020/4/1
 */
package com.yomahub.liteflow.test.component.cmp1;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

@Component("j")
public class JCmp extends NodeComponent {

	@Override
	public void process() {
		System.out.println("JCmp executed!");
	}

	@Override
	public boolean isAccess() {
		this.setIsEnd(true);
		return false;
	}
}
