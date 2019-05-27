// 定义控制器:
app.controller("allOrderController",function($scope,$controller,$http,allOrderService){
	// AngularJS中的继承:伪继承
	$controller('baseController',{$scope:$scope});
	


	// 分页查询
	$scope.findPage = function(page,rows){
		// 向后台发送请求获取数据:
        allOrderService.findPage(page,rows).success(function(response){
			$scope.paginationConf.totalItems = response.total;
			$scope.list = response.rows;
		});
	}

	//发货
    $scope.fh = function(){
        allOrderService.fh($scope.selectIds).success(function(response){
            // 判断审核是否成功:
            if(response.flag){
                // 保存成功
                alert(response.message);
                $scope.reloadList();
                $scope.selectIds = [];
            }else{
                // 保存失败
                alert(response.message);
            }
        });
    }


	
	$scope.searchEntity={};
	
	// 假设定义一个查询的实体：searchEntity
	$scope.search = function(page,rows){
		// 向后台发送请求获取数据:
        allOrderService.search(page,rows,$scope.searchEntity).success(function(response){
			console.log(response);
			$scope.paginationConf.totalItems = response.total;
			$scope.list = response.rows;
		});
	}
	
});
