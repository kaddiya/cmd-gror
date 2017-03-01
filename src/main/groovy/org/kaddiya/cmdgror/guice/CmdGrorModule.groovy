package org.kaddiya.cmdgror.guice

import com.google.inject.AbstractModule
import org.kaddiya.cmdgror.helpers.FileDockerRegisteryAuthFinderImpl
import org.kaddiya.grorchestrator.helpers.DockerRegistryAuthFinder
import org.kaddiya.grorchestrator.helpers.InstanceFinder

import org.kaddiya.grorchestrator.helpers.impl.HostFinderImpl
import org.kaddiya.grorchestrator.helpers.impl.InstanceFinderImpl
import org.kaddiya.grorchestrator.updators.PreviousToLatestSchemaUpdator
import org.kaddiya.grorchestrator.updators.impl.PreviousToLatestSchemaUpdatorImpl

/**
 * Created by Webonise on 01/03/17.
 */
class CmdGrorModule extends AbstractModule {
    @Override
    protected void configure() {
         bind(InstanceFinder).to(InstanceFinderImpl)
         bind(HostFinderImpl)
         bind(DockerRegistryAuthFinder).to(FileDockerRegisteryAuthFinderImpl)
         bind(PreviousToLatestSchemaUpdator).to(PreviousToLatestSchemaUpdatorImpl)
    }
}
