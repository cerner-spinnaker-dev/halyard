/*
 * Copyright 2020 THL A29 Limited, a Tencent company.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.halyard.cli.command.v1.config.providers.tencentcloud;

import com.beust.jcommander.Parameters;
import com.netflix.spinnaker.halyard.cli.command.v1.config.providers.AbstractBakeryCommand;

/** Interact with the Tencent Cloud provider's bakery */
@Parameters(separators = "=")
public class TencentCloudBakeryCommand extends AbstractBakeryCommand {

  @Override
  protected String getProviderName() {
    return "tencentcloud";
  }

  public TencentCloudBakeryCommand() {
    super();
    registerSubcommand(new TencentCloudEditBakeryDefaultsCommand());
    registerSubcommand(new TencentCloudBaseImageCommand());
  }
}
